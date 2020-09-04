cmake_minimum_required(VERSION 3.8)
project(FizzBuzz.src CXX)
set(CMAKE_CXX_STANDARD 17)
set(SOURCE_FILES FizzBuzz.h
        fizzbuzz.cpp)

add_library(${PROJECT_NAME} ${SOURCE_FILES})
target_include_directories(${PROJECT_NAME}
        INTERFACE ${CMAKE_CURRENT_SOURCE_DIR}/..)