package me.dio.copa.catar.domain.usecase

import kotlinx.coroutines.flow.Flow
import me.dio.copa.catar.domain.model.Match
import me.dio.copa.catar.domain.repositories.MatchesRepository

class GetMatchesUseCase constructor(
    private val repository : MatchesRepository,
){
    suspend operator fun invoke() : Flow<List<Match>> = repository.getMatches()
}