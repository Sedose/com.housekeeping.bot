package com.housekeeping.bot.domain

data class Duty(
    val user: User,
    val startDay: Int,
    val endDay: Int,
)
