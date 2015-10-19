cppflags = -Wall -std=c++11
objs = Student.o Driver.o
cc = g++

studs : $(objs)
	$(cc) -o studs $(objs)

Student.o : Student.cpp Student.h
	$(cc) $(cppflags) -c Student.cpp

Driver.o : Driver.cpp 
	$(cc) $(cppflags) -c Driver.cpp

clean:
	rm -f core studs $(objs)
