programmers = ["I'm an expert Python Programmer",
               "I'm an expert Javascript Programmer",
               "I'm a professional Python Programmer"
               "I'm a beginner C++ Programmer"
]
#method 1
for p in programmers:
    if p.find("Python"):
        print(p)
#method 2
for p in programmers:
    if "Python" in p:
        print(p)