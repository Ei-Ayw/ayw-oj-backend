package com.ayw.codingQuest.judge;

import com.ayw.codingQuest.judge.codesandbox.model.JudgeInfo;
import com.ayw.codingQuest.judge.strategy.DefaultJudgeStrategy;
import com.ayw.codingQuest.judge.strategy.JavaLanguageJudgeStrategy;
import com.ayw.codingQuest.judge.strategy.JudgeContext;
import com.ayw.codingQuest.judge.strategy.JudgeStrategy;
import com.ayw.codingQuest.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
