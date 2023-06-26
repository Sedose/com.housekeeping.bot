package com.housekeeping.bot.repository

import com.housekeeping.bot.domain.Duty
import com.housekeeping.bot.domain.Schedule

class ScheduleRepository(
    private val userRepository: UserRepository,
) {
    fun findSchedule(): Schedule {
        val users = userRepository.findAll()
        return Schedule(listOf(
            Duty(users[1], 1, 3),
            Duty(users[0], 4, 6),
            Duty(users[2], 7, 9),
            Duty(users[1], 10, 12),
            Duty(users[0], 13, 15),
            Duty(users[2], 16, 18)
        ))
    }
}
