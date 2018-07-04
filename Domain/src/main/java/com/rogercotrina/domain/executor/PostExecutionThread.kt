package com.rogercotrina.domain.executor

import io.reactivex.Scheduler

// Interface for interacting with RxJava without having to deal with any framework elements.
interface PostExecutionThread {
    var scheduler: Scheduler
}