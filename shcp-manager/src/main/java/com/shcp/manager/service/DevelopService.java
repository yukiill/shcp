package com.shcp.manager.service;

import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/6 16:17
 */
public interface DevelopService {

    List<TbDeveloper> findDevelops(String wd, String type);


}
