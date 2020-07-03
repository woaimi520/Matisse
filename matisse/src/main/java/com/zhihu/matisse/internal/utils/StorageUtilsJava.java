package com.zhihu.matisse.internal.utils;

import android.os.Environment;

import java.io.File;

/**
 * 作者：任宇
 * 日期：2020/7/3 20:12
 * 注释：
 */
public class StorageUtilsJava {
    /**
     * 应用目录
     */
    private final static String DIR_APP = "BearNote";

    /**
     * 照片文件目录
     */
    private final static String DIR_MEDIA_PHOTOS = "photos";
    /**
     * 音频文件目录
     */
    private final static String DIR_MEDIA_VOICES = "voices";

    /**
     * 视频文件目录
     */
    private final static String DIR_MEDIA_VIDEOS = "videos";

    /**
     * 媒体文件目录
     */
    private final static String DIR_MEDIA_MEDIAS = "medias";

    /**
     * 返回应用外部存储公文件夹
     * /storage/emulated/0/BearNote
     * @return APP directory
     */
    public static File  getAppDir()
    {
        File parent = Environment.getExternalStorageDirectory();
        File appDir = new File(parent, DIR_APP);
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        return appDir;
    }

    /**
     * 返回媒体文件夹
     *  /storage/emulated/0/BearNote/medias
     * @return Media directory
     */
    public static File   getMediasDir() {
        File parent = getAppDir();
        File mediasDir = new File(parent, DIR_MEDIA_MEDIAS);
        if (!mediasDir.exists()) {
            mediasDir.mkdir();
        }
        return mediasDir;
    }

    /**
     * 返回图片文件夹
     * /storage/emulated/0/BearNote/medias/photos
     * @return Media directory
     */
    public static File  getPhotosDir() {
        File parent = getMediasDir();
        File photosDir = new File(parent, DIR_MEDIA_PHOTOS);
        if (!photosDir.exists()) {
            photosDir.mkdir();
        }
        return photosDir;
    }

}
