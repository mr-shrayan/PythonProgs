from tkinter import *
doraemon = Tk()
v = Canvas(doraemon,bg = "black",height=350,width=230)
#righthand
h1=v.create_polygon(50,176,47,215,3,165,50,176,fill="deepskyblue2")
palm=v.create_oval(2,160,30,190,fill="white")
#lefthand
l1=v.create_polygon(178,180,178,215,228,220,178,180,fill="deepskyblue2")
palm=v.create_oval(200,200,228,230,fill="white")
#rightfoot
leg=v.create_oval(35,275,101,310,fill="white")
#leftfoot
leg=v.create_oval(120,275,190,310,fill="white")
#body
s = v.create_rectangle(47,190,178,285,fill = "deepskyblue2",outline="deepskyblue2")
#pocket oval 
c = v.create_oval(65,200,160,273,fill = "white")
#neckbelt
r = v.create_oval(45,165,180,205,outline = "black",fill ="red")
#face
circle = v.create_oval(20,40,200,200, fill="deepskyblue2")
#faceoval
vs = v.create_oval(40,70,180,200,fill ="white")
#left eye
e1 = v.create_oval(110,60,80,100, fill="white")
#left eyeball
i1 = v.create_oval(110,80,100,90,fill ="black")
#right eye
e2 = v.create_oval(110,60,140,100, fill="white")
#right eye ball
l2 = v.create_oval(110,80,120,90,fill="black")
#mid line bet nose n smile
m1 = v.create_line(110,90,110,140,width = 2)
#moustach left
m4 = v.create_line(105,115,45,108,width = 2)
m5 = v.create_line(105,123,55,123,width = 2)
m6 = v.create_line(105,127,45,135,width = 2)
#moustache right
m2 = v.create_line(115,115,183,108,width = 2)
m3 = v.create_line(115,123,170,123,width = 2)
m8 = v.create_line(115,127,183,135,width = 2)
#nose
n = v.create_oval(120,90,100,110,fill="red")
#smile
s2 = v.create_arc(65,100,150,170,start=180,extent=180,fill= "red")
#pocket
s2 = v.create_arc(77,200,145,260,start=180,extent=180)
#bell
r = v.create_oval(100,200,125,225,fill ="darkgoldenrod1")
#createlines
l1 = v.create_line(102,210,125,210,width=2)
l2 = v.create_line(102,213,125,213,width= 2)
#inner red oval
r1 = v.create_oval(110,213,115,223,fill = "red2")
#legspace
oval=v.create_oval(100,277,120,300,fill="black")
v.pack()
doraemon.mainloop() 