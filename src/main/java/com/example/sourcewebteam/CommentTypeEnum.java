package com.example.sourcewebteam;

public enum CommentTypeEnum {
    LEVEL_ONE_COMMENT(1),
    LEVEL_TWO_COMMENT(2);
    private final Integer type;
    CommentTypeEnum(Integer type) { this.type = type; }
    public Integer getType(){ return type; }
    public static boolean isExist(Integer type){
        for(CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if(commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }
}
