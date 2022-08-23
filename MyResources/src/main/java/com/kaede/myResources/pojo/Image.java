package com.kaede.myResources.pojo;

import java.util.Arrays;

/**
 * @author kaede
 * @create 2022-08-14 17:08
 *
 * image_id   image_name   image_url   image_tags
 */

public class Image {

    private Integer imageId;
    private String imageName;
    private String imageUrl;
    private String[] imageTags;

    public Image() {
    }

    public Image(Integer imageId, String imageName, String imageUrl, String[] imageTags) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.imageUrl = imageUrl;
        this.imageTags = imageTags;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String[] getImageTags() {
        return imageTags;
    }

    public void setImageTags(String[] imageTags) {
        this.imageTags = imageTags;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imageName='" + imageName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageTags=" + Arrays.toString(imageTags) +
                '}';
    }
}
