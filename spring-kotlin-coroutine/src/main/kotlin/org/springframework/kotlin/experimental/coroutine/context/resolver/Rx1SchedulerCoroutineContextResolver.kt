/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.kotlin.experimental.coroutine.context.resolver

import kotlinx.coroutines.experimental.rx1.asCoroutineDispatcher
import org.springframework.kotlin.experimental.coroutine.context.CoroutineContextResolver
import rx.Scheduler
import kotlin.coroutines.experimental.CoroutineContext

internal open class Rx1SchedulerCoroutineContextResolver : CoroutineContextResolver {
    override fun resolveContext(beanName: String, bean: Any?): CoroutineContext? =
            (bean as? Scheduler)?.asCoroutineDispatcher()
}