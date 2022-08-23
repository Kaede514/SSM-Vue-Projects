package com.kaede.myResources.pojo;

import java.util.Arrays;

/**
 * @author kaede
 * @create 2022-08-14 17:09
 *
 * video_id   video_name   video_url   video_tags
 */

public class Video {

    private Integer videoId;
    private String videoName;
    private String videoUrl;
    private String[] videoTags;
    private Integer userId;
    public Video() {
    }

    public Video(Integer videoId, String videoName, String videoUrl, String[] videoTags, Integer userId) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.videoUrl = videoUrl;
        this.videoTags = videoTags;
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String[] getVideoTags() {
        return videoTags;
    }

    public void setVideoTags(String[] videoTags) {
        this.videoTags = videoTags;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoTags=" + Arrays.toString(videoTags) +
                ", userId=" + userId +
                '}';
    }
}
