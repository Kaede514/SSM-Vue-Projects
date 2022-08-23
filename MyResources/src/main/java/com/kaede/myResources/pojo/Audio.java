package com.kaede.myResources.pojo;

/**
 * @author kaede
 * @create 2022-08-14 17:05
 *
 * audio_id   audio_name   audio_singer   audio_url
 */

public class Audio {

    private Integer audioId;
    private String audioName;
    private String audioSinger;
    private String audioUrl;

    public Audio() {
    }

    public Audio(Integer audioId, String audioName, String audioSinger, String audioUrl) {
        this.audioId = audioId;
        this.audioName = audioName;
        this.audioSinger = audioSinger;
        this.audioUrl = audioUrl;
    }

    public Integer getAudioId() {
        return audioId;
    }

    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public String getAudioSinger() {
        return audioSinger;
    }

    public void setAudioSinger(String audioSinger) {
        this.audioSinger = audioSinger;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "audioId=" + audioId +
                ", audioName='" + audioName + '\'' +
                ", audioSinger='" + audioSinger + '\'' +
                ", audioUrl='" + audioUrl + '\'' +
                '}';
    }
}
