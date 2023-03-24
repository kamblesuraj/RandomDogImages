package com.kamblesuraj.dogimagegenerator.domain.mapper

interface Mapper<in I, out O> {
    suspend fun map(input: I): O
}