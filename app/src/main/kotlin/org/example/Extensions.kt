package org.example

import net.datafaker.Faker
import java.util.concurrent.Callable

fun <A> Faker.doWith(seed: Long, callable: Callable<A>): A = this.doWith(callable, seed)
