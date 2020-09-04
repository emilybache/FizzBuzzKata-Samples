cmake_minimum_required(VERSION 3.8)
project(FizzBuzz)

set(CMAKE_CXX_STANDARD 17)
include_directories(third_party)

enable_testing()
add_subdirectory(src)
add_subdirectory(test)