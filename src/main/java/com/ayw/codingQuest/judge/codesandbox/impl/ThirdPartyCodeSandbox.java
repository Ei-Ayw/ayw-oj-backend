package com.ayw.codingQuest.judge.codesandbox.impl;

import com.ayw.codingQuest.judge.codesandbox.model.ExecuteCodeRequest;
import com.ayw.codingQuest.judge.codesandbox.model.ExecuteCodeResponse;
import com.ayw.codingQuest.judge.codesandbox.CodeSandbox;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
