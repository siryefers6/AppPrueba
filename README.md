
------------------------------------------------------------
Gradle 8.13
------------------------------------------------------------

Build time:    2025-02-25 09:22:14 UTC
Revision:      073314332697ba45c16c0a0ce1891fa6794179ff

Kotlin:        2.0.21
Groovy:        3.0.22
Ant:           Apache Ant(TM) version 1.10.15 compiled on August 25 2024
Launcher JVM:  17.0.14 (Ubuntu 17.0.14+7-Ubuntu-122.04.1)
Daemon JVM:    /usr/lib/jvm/java-17-openjdk-amd64 (no JDK specified, using current Java home)
OS:            Linux 5.15.167.4-microsoft-standard-WSL2 amd64

------------------------------------------------------------

# Variables de .bashrc

```bash
#THIS MUST BE AT THE END OF THE FILE FOR SDKMAN TO WORK!!!
export SDKMAN_DIR="$HOME/.sdkman"
[[ -s "$HOME/.sdkman/bin/sdkman-init.sh" ]] && source "$HOME/.sdkman/bin/sdkman-init.sh"

export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion

# Configuración del SDK de Android
export ANDROID_HOME="$HOME/android_sdk"
export PATH="$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$PATH"
export JAVA_HOME="/usr/lib/jvm/java-1.17.0-openjdk-amd64"
export PATH="$JAVA_HOME/bin:$PATH"
```


# Cosas que debo instalar para programar en Kotlin proyectos Android desde terminal

1. Instalar Java JDK 17.0
2. Instalar Gradle 8.13
3. Instalar Kotlin 2.0.21
4. Instalar Android SDK
5. Configurar las variables de entorno


# Instalar Java JDK 17.0 Gradle 8.13 y Kotlin 2.0.21 con SDKMAN

```bashrc
curl -s "https://get.sdkman.io" | bashrc
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 17.0.0-open
sdk install gradle 8.13
sdk install kotlin 2.0.21
```


# Instalar Android SDK

1. Descargar el SDK de Android desde la página oficial de android
2. Descomprimir el archivo en la carpeta `~/android_sdk`
3. Configurar las variables de entorno en el archivo `.bashrc`

```bash
export ANDROID_HOME="$HOME/android_sdk"
export PATH="$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$PATH"
export JAVA_HOME="/usr/lib/jvm/java-1.17.0-openjdk-amd64"
export PATH="$JAVA_HOME/bin:$PATH"
```


# Comandos útiles para programar en kotlin

```bashrc
# Compilar aplicación .apk
gradle assembleDebug

# Instalar aplicación en un dispositivo
adb install -r app/build/outputs/apk/debug/app-debug.apk

# Ejecutar aplicación en un dispositivo
adb shell am start -n com.example.myapp/com.example.myapp.MainActivity
```
