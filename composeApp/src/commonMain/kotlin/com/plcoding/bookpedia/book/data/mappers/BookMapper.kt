package com.plcoding.bookpedia.book.data.mappers

import com.plcoding.bookpedia.book.data.database.BookEntity
import com.plcoding.bookpedia.book.domain.Book

fun Book.toBookEntity() = BookEntity(
    id = id,
    title = title,
    description = description,
    imageUrl = imageUrl,
    languages = languages,
    authors = authors,
    firstPublishYear = title,
    ratingsAverage = averageRating,
    ratingsCount = ratingCount,
    numPagesMedian = numPages,
    numEditions = numEditions,
)

fun BookEntity.toBook() = Book(
    id = id,
    title = title,
    description = description,
    imageUrl = imageUrl,
    languages = languages,
    authors = authors,
    firstPublishYear = title,
    averageRating = ratingsAverage,
    ratingCount = ratingsCount,
    numPages = numPagesMedian,
    numEditions = numEditions,
)