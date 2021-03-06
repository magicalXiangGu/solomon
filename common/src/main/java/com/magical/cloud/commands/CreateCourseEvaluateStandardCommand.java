package com.magical.cloud.commands;

import com.magical.cloud.domain.CheckTypeEnum;
import com.magical.cloud.domain.CourseEvaluateStandardID;
import com.magical.cloud.domain.ScoreTypeEnum;
import com.magical.cloud.domain.TeachingClassID;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhouxp on 2017/10/26
 */
public class CreateCourseEvaluateStandardCommand {

    @TargetAggregateIdentifier
    private CourseEvaluateStandardID courseEvaluateStandardID;

    private String courseID;

    //版本号
    private String version;

    //考核方式
    private CheckTypeEnum checkType;


    //各考核成绩权重
    private HashMap<ScoreTypeEnum,Float> everyMarkWeighting=new HashMap();


    public CreateCourseEvaluateStandardCommand(String courseID, String version, CheckTypeEnum checkType, HashMap<ScoreTypeEnum, Float> everyMarkWeighting) {
        this.courseID = courseID;
        this.version = version;
        this.checkType = checkType;
        this.everyMarkWeighting = everyMarkWeighting;
    }

    public CourseEvaluateStandardID getCourseEvaluateStandardID() {
        return courseEvaluateStandardID;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getVersion() {
        return version;
    }

    public CheckTypeEnum getCheckType() {
        return checkType;
    }

    public HashMap<ScoreTypeEnum, Float> getEveryMarkWeighting() {
        return everyMarkWeighting;
    }
}
