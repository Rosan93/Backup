# -*- coding: utf-8 -*-
"""
Created on Fri Aug  3 08:01:15 2018

@author: Yodin
"""
import requests
from bs4 import BeautifulSoup

url = "http://quotes.toscrape.com/"
source = requests.get(url)

#print(source.content)

soup=BeautifulSoup(source.content,'lxml')

#sp_index = soup.find_all('a')
title = soup.find('div',class_='header-box').find('div')

title = title.find('h1').find('a').text

"""
quotes = soup.find_all('span',class_='text')

print(quotes[1].text) """


"""
for quote in quotes:
    print(quote.text) """

#print(title)
#print(quotes)

"""    
tags = soup.find('div',class_='tags')
tags = tags.find_all('a', class_='tag')
for i in tags:
    print(i.text) """
 
#find specific tag
tags = soup.find('div',class_='tags')
tags = tags.find_all('a', class_='tag')

""" finding all tags
tags = soup.find_all('a', class_='tag')
print(tags) 
for i in tags:
    print(i.text)
 """

for i in tags:
    print(i.text)
#print(tags[1].text)


