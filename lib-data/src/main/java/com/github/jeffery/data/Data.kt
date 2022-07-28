package com.github.jeffery.data

import com.github.jeffery.data.file.FileDataSource
import com.github.jeffery.data.http.HttpDataSource
import com.github.jeffery.data.kv.KvDataSource
import com.github.jeffery.data.sqlite.DbDataSource

/**
 * @author mxlei
 * @date   2022/7/28
 */
object Data {
    val file: FileDataSource by lazy {
        FileDataSource()
    }
    val http: HttpDataSource by lazy {
        HttpDataSource()
    }
    val kv: KvDataSource by lazy {
        KvDataSource()
    }
    val db: DbDataSource by lazy {
        DbDataSource()
    }
}