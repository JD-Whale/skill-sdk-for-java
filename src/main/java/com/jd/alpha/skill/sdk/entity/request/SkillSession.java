/*
 * Copyright 2018. JD.COM Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jd.alpha.skill.sdk.entity.request;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillSession {

    /**
     * 是否为新会话
     */
    private boolean isNew;

    /**
     * 全局唯一标识
     */
    private String sessionId;

    /**
     * 用户信息
     */
    private SkillSessionUserInfo user;

    /**
     * 设备信息
     */
    private SkillSessionDeviceInfo device;

    /**
     * 应用信息
     */
    private SkillSessionApplicationInfo application;

    /**
     * 上下文信息
     */
    private Map<String, String> contexts;

}
