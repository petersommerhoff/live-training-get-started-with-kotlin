package livetraining

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 *
 * Question by Dave: what's the best way to handle nullables when parsing JSON?
 *
 * Based on https://medium.com/@MaxMello/most-elegant-way-of-using-gson-kotlin-with-default-values-and-null-safety-b6216ac5328c
 *
 * Alternative: use Moshi if you don't mind introducing kotlin.reflect (~10k methods)
 */
interface Failable<out T : Any> {
  fun getOrNull(): T?
}

data class Article(
    @SerializedName("title") private val _title: String?,
    @SerializedName("body") private val _body: String? = "",
    val viewCount: Int = 0,
    val payWall: Boolean = false,
    @SerializedName("titleImage") private val _titleImage: String? = ""
) : Failable<Article> {
  val title
    get() = _title ?: throw IllegalArgumentException("Title is required")
  val body
    get() = _body ?: ""
  val titleImage
    get() = _titleImage ?: ""

  override fun getOrNull(): Article? = try {
    // Call getters to initialize default values or throw
    this.title
    this.body
    this.titleImage

    this
  } catch (e: Throwable) {
    null
  }

  override fun toString() = "Article(title=$title, body=$body, viewCount=$viewCount, payWall=$payWall, titleImage=$titleImage)"
}

fun main(args: Array<String>) {
  val json = """
  {
    "title": "Kotlin for Android",
    "body": null,
    "viewCount": 9999,
    "payWall": false,
    "ignoredProperty": "Ignored"
  }
"""
  val article = Gson().fromJson(json, Article::class.java).getOrNull()
  println(article)
}
