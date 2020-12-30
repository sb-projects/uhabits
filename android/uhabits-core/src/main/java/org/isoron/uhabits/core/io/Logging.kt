/*
 * Copyright (C) 2016-2020 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.isoron.uhabits.core.io

import java.lang.Exception

interface Logging {
    fun getLogger(name: String): Logger
}

interface Logger {
    fun info(msg: String)
    fun debug(msg: String)
    fun error(msg: String)
    fun error(exception: Exception)
}

class StandardLogging : Logging {
    override fun getLogger(name: String): Logger {
        return StandardLogger(name)
    }
}

class StandardLogger(val name: String): Logger {
    override fun info(msg: String) {
        println("[$name] $msg")
    }

    override fun debug(msg: String) {
        println("[$name] $msg")
    }

    override fun error(msg: String) {
        println("[$name] $msg")
    }

    override fun error(exception: Exception) {
        exception.printStackTrace()
    }

}