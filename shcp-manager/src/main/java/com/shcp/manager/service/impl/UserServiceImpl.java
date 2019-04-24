package com.shcp.manager.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.UserLimitMapper;
import com.shcp.dao.mapper.UserLimitRelationshipMapper;
import com.shcp.dao.mapper.UserMapper;
import com.shcp.manager.service.UserService;
import com.shcp.manager.utils.IdGenerator;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Yuki
 * @date 2019/4/23 20:49
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserLimitMapper userLimitMapper;
    @Resource
    private UserLimitRelationshipMapper userLimitRelationshipMapper;

    @Override
    public ShcpResult getUsers(String wd, String type) {
        if(Objects.equals("q", type)){
            //用户编号
            long uid;
            try {
                uid = Long.parseLong(wd);
            } catch (NumberFormatException e) {
                return ShcpResult.build(702, "输入的数据不合法");
            }
            User user = userMapper.selectByPrimaryKey(uid);
            return ShcpResult.ok(user);
        } else  if(Objects.equals("p", type)){
            //用户名称
            UserExample example = new UserExample();
            example.createCriteria().andUsernameLike(wd);
            List<User> userList = userMapper.selectByExample(example);
            return ShcpResult.ok(userList);
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addUserLimitForUser(long UID, String ULname) {
        UserLimitExample userLimitExample = new UserLimitExample();
        userLimitExample.createCriteria()
                .andUlnameEqualTo(ULname);
        UserLimit userLimit = userLimitMapper.selectByExample(userLimitExample).get(0);
        if(Objects.isNull(userLimit)){
            return ShcpResult.build(703, "输入了无效的权限名称");
        }
        UserLimitRelationship userLimitRelationship = new UserLimitRelationship();
        userLimitRelationship.setUid(UID);
        userLimitRelationship.setUlid(userLimit.getUlid());
        userLimitRelationship.setUlstatus(true);
        if(userLimitRelationshipMapper.insert(userLimitRelationship) == 1){
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "出现了意料之外的错误");
    }

    @Override
    public ShcpResult getAllUsers(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<User> users = userMapper.selectByExample(new UserExample());
        PageInfo<User> pageInfo = new PageInfo<>(users);
        log.info("page:{} rows:{} get user data", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getAllUserLimit(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<UserLimit> userLimits = userLimitMapper.selectByExample(new UserLimitExample());
        PageInfo<UserLimit> pageInfo = new PageInfo<>(userLimits);
        log.info("page:{} rows:{} get userLimit data", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getUserLimitById(short ULID) {
        UserLimit userLimit = userLimitMapper.selectByPrimaryKey(ULID);
        return ShcpResult.ok(userLimit);
    }

    @Override
    public ShcpResult getUserByUid(long UID) {
        User user = userMapper.selectByPrimaryKey(UID);
        return ShcpResult.ok(user);
    }

    @Override
    public ShcpResult modifyUserInfo(long UID) {
        User user = userMapper.selectByPrimaryKey(UID);
        if(Objects.isNull(user)){
            log.info("modify userinfo don't have opposite instance UID:{} fail", UID);
            return ShcpResult.build(703, "没有相应用户信息");
        }
        //TODO 没写完，不知道如何通过一个字段一次接受多个数据
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult deleteUserLimit(short ULID) {
        if(userLimitMapper.deleteByPrimaryKey(ULID) == 1){
            log.info("delete ULID:{} success", ULID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "发生了意料之外的错误");
    }

    @Override
    public ShcpResult modifyUserLimit(short ULID, String ULname) {
        UserLimit userLimit = userLimitMapper.selectByPrimaryKey(ULID);
        if(Objects.isNull(userLimit)){
            log.info("modfiy userLimit don't have opposite instance ULID:{} fail", ULID);
            return ShcpResult.build(703, "没有相应用户权限信息");
        }
        if(userLimitMapper.updateByPrimaryKey(userLimit) == 1){
            log.info("modifyUserLimit ULID:{} ULname:{} success", ULID, ULname);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "发生了意料之外的错误");
    }

    @Override
    public ShcpResult addUserLimit(String ULname) {
        UserLimit userLimit = new UserLimit();
        userLimit.setUlid(IdGenerator.getUserLimitId());
        userLimit.setUlname(ULname);
        if(userLimitMapper.insertSelective(userLimit) == 1){
            log.info("insert new userLimit ULID:{} ULname:{}", userLimit.getUlid(), userLimit.getUlname());
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "发生了意料之外的错误");
    }

    @Override
    public ShcpResult getUserLimitsByUID(long UID) {
        UserLimitRelationshipExample userLimitRelationshipExample = new UserLimitRelationshipExample();
        userLimitRelationshipExample.createCriteria()
                .andUidEqualTo(UID);
        List<UserLimitRelationship> relationships = userLimitRelationshipMapper.selectByExample(userLimitRelationshipExample);
        List<Short> ulids = relationships.stream().map(UserLimitRelationship::getUlid).collect(Collectors.toList());
        UserLimitExample userLimitExample = new UserLimitExample();
        userLimitExample.createCriteria()
                .andUlidIn(ulids);
        List<UserLimit> userLimits = userLimitMapper.selectByExample(userLimitExample);
        return ShcpResult.ok(userLimits);
    }

    //TODO 写一个修改用户权限的函数
}
