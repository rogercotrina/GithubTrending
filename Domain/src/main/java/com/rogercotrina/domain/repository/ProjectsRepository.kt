package com.rogercotrina.domain.repository

import com.rogercotrina.domain.model.Project
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Data access interface for domain layer.
 */
interface ProjectsRepository {

    fun getProjects(): Observable<List<Project>>

    fun bookmarkProject(projectId: String): Completable

    fun unbookmarkProject(projectId: String): Completable

    fun getBookedMarkedProjects(): Observable<List<Project>>
}