cmake_minimum_required(VERSION 3.13)
project(fizzbuzz)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")

# uncomment these lines to enable coverage measurements using gcov
#set(CMAKE_C_FLAGS "--coverage")
#set(CMAKE_EXE_LINKER_FLAGS "--coverage")

enable_testing()
add_subdirectory(tests)

