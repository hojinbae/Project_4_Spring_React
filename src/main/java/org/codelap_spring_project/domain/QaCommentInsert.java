package org.codelap_spring_project.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QaCommentInsert {

    private String qacommentid;
    private String qaid;
    private String userid;
    private String created_at;
    private String content;
    private String parentcommentid;


    public QaCommentInsert(String qacommentid, String qaid, String userid, String created_at, String content, String parentcommentid) {
        this.qacommentid = qacommentid;
        this.qaid = qaid;
        this.userid = userid;
        this.created_at = created_at;
        this.content = content;
        this.parentcommentid = parentcommentid;
    }

    public QaCommentInsert(){

    }
}
