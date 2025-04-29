package com.ayw.codingQuest.judge.strategy;

import com.ayw.codingQuest.judge.codesandbox.model.JudgeInfo;
import com.ayw.codingQuest.model.dto.question.JudgeCase;
import com.ayw.codingQuest.model.entity.Question;
import com.ayw.codingQuest.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
