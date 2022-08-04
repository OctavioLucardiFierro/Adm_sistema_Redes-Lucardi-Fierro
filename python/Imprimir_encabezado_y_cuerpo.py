import requests
import json
#
#resp = requests.get('https://api.darksky.net/forecast/b4497c8a6b18bf75776b7fd997f2b90a/-34.6183926,-58.4373167?lang=es&units=ca')
#
#print (resp)
if __name__== '__main__':
    url = 'https://api.darksky.net/forecast/b4497c8a6b18bf75776b7fd997f2b90a/-34.6183926,-58.4373167?lang=es&units=ca'
    response = requests.get(url)
    body = response.json()
    print (response.headers)
    
    #Imprimir y guardar el header de la api
    encabezado = open('Header.txt','w')
    encabezado.write(str(response.headers))
    encabezado.close()

     #Imprimir y guardar el contenido de la api
    if response.status_code == 200:
        content = response.content
        #print (response.content)
        file = open('logro32.txt','wb')
        file.write(content)
        file.close()
