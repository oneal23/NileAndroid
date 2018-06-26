package com.na.demo.data.net.api;

import com.na.demo.data.net.base.ApiResponse;

import java.util.List;

/**
 * @actor:taotao
 * @DATE: 2018/5/25
 */
public class GameStarVoteResponse extends ApiResponse<List<GameStarVoteResponse.LastWinUser>> {

    private List<LastWinUser> data;

    @Override
    public List<LastWinUser> getData() {
        return data;
    }

    public static class LastWinUser {
        private String prizeName;
        private String nickName;

        public String getPrizeName() {
            return prizeName;
        }

        public void setPrizeName(String prizeName) {
            this.prizeName = prizeName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }
    }
}