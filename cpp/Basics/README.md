C++ has a "duplicate symbols error" (https://www.youtube.com/watch?v=U1L--suitgA) which can be thrown when you have
multiple "main" functions spread across different files within the same "project". This error can also be thrown due to
other reasons as explained by the Youtube Video, but this is the main concern here. 

Because this is a "language notes" project, to run any file, change the function with the same name as the file name
back to "main", and then change the "main" function in the "main.cpp" file to something else. Then, you'll be able
to run the code in that file.