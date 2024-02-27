@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  webapp startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and WEBAPP_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\webapp-0.1.jar;%APP_HOME%\lib\micronaut-data-hibernate-jpa-4.6.1.jar;%APP_HOME%\lib\micronaut-data-jdbc-4.6.1.jar;%APP_HOME%\lib\micronaut-kotlin-runtime-4.2.0.jar;%APP_HOME%\lib\micronaut-serde-jackson-2.8.1.jar;%APP_HOME%\lib\micronaut-jdbc-hikari-5.5.1.jar;%APP_HOME%\lib\micronaut-hibernate-jpa-5.5.1.jar;%APP_HOME%\lib\micronaut-data-tx-hibernate-4.6.1.jar;%APP_HOME%\lib\micronaut-data-tx-jdbc-4.6.1.jar;%APP_HOME%\lib\micronaut-data-connection-jdbc-4.6.1.jar;%APP_HOME%\lib\micronaut-jdbc-5.5.1.jar;%APP_HOME%\lib\micronaut-data-jpa-4.6.1.jar;%APP_HOME%\lib\micronaut-data-runtime-4.6.1.jar;%APP_HOME%\lib\micronaut-data-model-4.6.1.jar;%APP_HOME%\lib\micronaut-reactor-3.2.1.jar;%APP_HOME%\lib\micronaut-serde-support-2.8.1.jar;%APP_HOME%\lib\micronaut-serde-api-2.8.1.jar;%APP_HOME%\lib\micronaut-data-tx-4.6.1.jar;%APP_HOME%\lib\micronaut-data-connection-hibernate-4.6.1.jar;%APP_HOME%\lib\micronaut-data-connection-4.6.1.jar;%APP_HOME%\lib\micronaut-http-server-netty-4.3.6.jar;%APP_HOME%\lib\micronaut-http-netty-4.3.6.jar;%APP_HOME%\lib\micronaut-jackson-core-4.3.6.jar;%APP_HOME%\lib\micronaut-json-core-4.3.6.jar;%APP_HOME%\lib\micronaut-http-server-4.3.6.jar;%APP_HOME%\lib\micronaut-router-4.3.6.jar;%APP_HOME%\lib\micronaut-http-4.3.6.jar;%APP_HOME%\lib\micronaut-context-propagation-4.3.6.jar;%APP_HOME%\lib\micronaut-context-4.3.6.jar;%APP_HOME%\lib\micronaut-buffer-netty-4.3.6.jar;%APP_HOME%\lib\micronaut-aop-4.3.6.jar;%APP_HOME%\lib\micronaut-inject-4.3.6.jar;%APP_HOME%\lib\jackson-databind-2.16.1.jar;%APP_HOME%\lib\jackson-annotations-2.16.1.jar;%APP_HOME%\lib\jackson-core-2.16.1.jar;%APP_HOME%\lib\jackson-module-kotlin-2.16.1.jar;%APP_HOME%\lib\kotlin-reflect-1.9.22.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.9.22.jar;%APP_HOME%\lib\kotlin-stdlib-1.9.22.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.9.22.jar;%APP_HOME%\lib\javax.persistence-api-2.2.jar;%APP_HOME%\lib\logback-classic-1.4.14.jar;%APP_HOME%\lib\postgresql-42.7.1.jar;%APP_HOME%\lib\HikariCP-5.1.0.jar;%APP_HOME%\lib\jakarta.annotation-api-2.1.1.jar;%APP_HOME%\lib\netty-codec-http2-4.1.107.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.107.Final.jar;%APP_HOME%\lib\netty-handler-4.1.107.Final.jar;%APP_HOME%\lib\netty-codec-4.1.107.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.107.Final.jar;%APP_HOME%\lib\netty-transport-4.1.107.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.107.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.107.Final.jar;%APP_HOME%\lib\netty-common-4.1.107.Final.jar;%APP_HOME%\lib\reactor-core-3.6.1.jar;%APP_HOME%\lib\micronaut-core-reactive-4.3.6.jar;%APP_HOME%\lib\reactive-streams-1.0.4.jar;%APP_HOME%\lib\micronaut-core-4.3.6.jar;%APP_HOME%\lib\hibernate-core-6.4.4.Final.jar;%APP_HOME%\lib\jakarta.persistence-api-3.1.0.jar;%APP_HOME%\lib\jakarta.transaction-api-2.0.1.jar;%APP_HOME%\lib\logback-core-1.4.14.jar;%APP_HOME%\lib\slf4j-api-2.0.12.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\jakarta.inject-api-2.0.1.jar;%APP_HOME%\lib\config-1.4.3.jar;%APP_HOME%\lib\checker-qual-3.41.0.jar;%APP_HOME%\lib\jboss-logging-3.5.0.Final.jar;%APP_HOME%\lib\hibernate-commons-annotations-6.0.6.Final.jar;%APP_HOME%\lib\jandex-3.1.2.jar;%APP_HOME%\lib\classmate-1.5.1.jar;%APP_HOME%\lib\byte-buddy-1.14.11.jar;%APP_HOME%\lib\jaxb-runtime-4.0.2.jar;%APP_HOME%\lib\jaxb-core-4.0.2.jar;%APP_HOME%\lib\jakarta.xml.bind-api-4.0.0.jar;%APP_HOME%\lib\antlr4-runtime-4.13.0.jar;%APP_HOME%\lib\angus-activation-2.0.0.jar;%APP_HOME%\lib\jakarta.activation-api-2.1.1.jar;%APP_HOME%\lib\txw2-4.0.2.jar;%APP_HOME%\lib\istack-commons-runtime-4.1.1.jar


@rem Execute webapp
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %WEBAPP_OPTS%  -classpath "%CLASSPATH%" com.example.ApplicationKt %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable WEBAPP_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%WEBAPP_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
