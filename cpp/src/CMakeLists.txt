cmake_minimum_required(VERSION 3.8)
project(FizzBuzz.src CXX)
set(CMAKE_CXX_STANDARD 17)
set(SOURCE_FILES FizzBuzz1.h
        FizzBuzz1.cpp
        FizzBuzz2.h
        FizzBuzz2.cpp
        FizzBuzz3.h
        FizzBuzz3.cpp
        FizzBuzz4.h
        FizzBuzz4.cpp
        FizzBuzz5.cpp FizzBuzz5.h)

add_library(${PROJECT_NAME} ${SOURCE_FILES})
target_include_directories(${PROJECT_NAME}
        INTERFACE ${CMAKE_CURRENT_SOURCE_DIR}/..)