package wizard.dependencies

import wizard.Dependency
import wizard.ProjectPlatform.*

val RoomPlugin = Dependency(
    title = "Room",
    description = "Generates SQL By Room",
    url = "https://developer.android.com/kotlin/multiplatform/room",
    group = "androidx.room",
    id = "gradle-plugin",
    version = "2.7.2",
    catalogVersionName = "room",
    catalogName = "room",
    platforms = emptySet()
)

val RoomPluginRuntime = RoomPlugin.copy(
    id = "room-runtime",
    catalogName = "room-runtime",
    platforms = emptySet()
)

val RoomPluginCompiler = RoomPlugin.copy(
    id = "room-compiler",
    catalogName = "room-compiler",
    platforms = setOf(Android, Ios, Jvm),
    isKspDependency = true
)

val DevToolKSP = Dependency(
    title = "KSP",
    description = "Kotlin Symbol Processing (KSP) is an API",
    url = "https://github.com/google/ksp",
    group = "com.google.devtools.ksp",
    id = "gradle-plugin",
    version = "${KotlinPlugin.version}-2.0.2",
    catalogVersionName = "ksp",
    catalogName = "ksp",
    platforms = emptySet()
)
