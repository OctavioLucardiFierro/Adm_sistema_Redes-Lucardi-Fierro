import requests
#
#resp = requests.get('https://api.darksky.net/forecast/b4497c8a6b18bf75776b7fd997f2b90a/-34.6183926,-58.4373167?lang=es&units=ca')
#
#print (resp)
if __name__== '__main__':
    url = 'https://api.darksky.net/forecast/b4497c8a6b18bf75776b7fd997f2b90a/-34.6183926,-58.4373167?lang=es&units=ca'
    response = requests.get(url)

    if response.status_code == 200:
        content = response.content
        #print (response.content)
    
        file = open('logro32.txt','wb')
        file.write(content)
        file.close()