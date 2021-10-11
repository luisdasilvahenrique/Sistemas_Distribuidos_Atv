from socket import *
serverName = 'localhost'
serverPort = 12000
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((serverName,serverPort))
sentence = SOCK_RAW('Insira uma frase em minúsculas:')
clientSocket.send(sentence)
modifiedSentence = clientSocket.recv(1024)
print ('Para Servidor:'), modifiedSentence
clientSocket.close()
