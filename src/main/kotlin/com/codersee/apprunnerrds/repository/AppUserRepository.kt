package com.codersee.apprunnerrds.repository

import com.codersee.apprunnerrds.model.AppUser
import org.springframework.data.repository.CrudRepository

interface AppUserRepository : CrudRepository<AppUser, Long>