package com.shcp.client.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;

/**
 * @author Yuki
 * @date 2019/3/27 21:25
 */
@Slf4j
public class FileUtil {

    public static final String DEFAULT_IMAGE_URL= "C:/Users/Yuki/Desktop/photo/default.jpg";

    private static final String FILESYSTEM_ROOT = "C:/Users/Yuki/Desktop/users/";

    /**
     * 为当前用户在服务器创建一个专门的文件夹
     * @param username 用户名
     */
    public static void mkdirForUser(String username){
        if(Objects.isNull(username) || Objects.equals("", username)){
            throw new RuntimeException("username is null or no length");
        }
        String filepath = FILESYSTEM_ROOT + username;
        File file = new File(filepath);
        if(!file.exists()){
            if(file.mkdir()){
                log.info("mkdir {} for user", filepath);
            } else {
                log.error("mkdir {} for user failed", filepath);
            }
        }
    }

    public static String uploadHeadImage(String username, MultipartFile multipartFile) {
        if(Objects.isNull(multipartFile)){
            log.error("username:{} input files is null", username);
            throw new RuntimeException("input file should not be null");
        }
        String original = multipartFile.getOriginalFilename();
        String uuid = String.valueOf(UUID.randomUUID());
        String extName = original.substring(original.lastIndexOf("."), original.length());
        String filepath = new StringBuffer().append(FILESYSTEM_ROOT).append(username)
                .append("/").append(uuid).append(extName).toString();
        try {
            multipartFile.transferTo(new File(filepath));
            return filepath;
        } catch (IOException e) {
            log.info("username:{} upload headimage failed\n message:{}", username, e.getMessage());
            throw new RuntimeException("upload file failed");
        }
    }
}
