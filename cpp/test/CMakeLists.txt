cmake_minimum_required(VERSION 3.8)
project(FizzBuzz.tests)
set(CMAKE_CXX_STANDARD 17)
set(SOURCE_FILES
        main.cpp
        FizzBuzzTest.cpp
        )
add_executable(${PROJECT_NAME} ${SOURCE_FILES} )
find_library(FizzBuzz.src src ../src)
target_link_libraries(${PROJECT_NAME}  LINK_PUBLIC FizzBuzz.src)
add_test(NAME FizzBuzz.tests COMMAND FizzBuzz.tests)