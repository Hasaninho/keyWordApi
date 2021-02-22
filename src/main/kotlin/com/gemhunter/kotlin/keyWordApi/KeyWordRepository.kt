package com.gemhunter.kotlin.keyWordApi

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "keyword", path = "keyword")
interface KeyWordRepository : CrudRepository<KeyWordModel, Long> {
}