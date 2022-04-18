import sys, os;
# importing the required module
import matplotlib.pyplot as plt
import json

fileObject = open("points.json", "r")
jsonContent = fileObject.read()
pointList = json.loads(jsonContent)

# x axis values
x = pointList['x']
# corresponding y axis values
y = pointList['y']
 
# plotting the points
plt.plot(x, y)
 
# naming the x axis
plt.xlabel('x - axis')
# naming the y axis
plt.ylabel('y - axis')
 
# giving a title to my graph
plt.title('My first graph!')
 
# function to show the plot
plt.show()
