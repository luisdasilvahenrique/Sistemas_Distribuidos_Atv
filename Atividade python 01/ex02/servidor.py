import socket

HOST = 'localhost'
PORT = 50000

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST, PORT))
s.listen()
print('Aguardando conexão de um cliente')

numberOne = 0
numberTwo = 0
result = 0
operator = ''

numberOne = float(input('Digite o número 1: '))
operator = input('Digite a operação')
numberTwo = float(input('Digite o número 2: '))

if operator == '+':
    result = numberOne + numberTwo
elif operator == '-':
    result = numberOne - numberTwo
elif operator =='/':
    result = numberOne / numberTwo
elif operator == '*':
    result = numberOne * numberTwo 
else:
    result = 'Operação mal sucedida'

print(str(numberOne) + ' ' + str(operator) + ' ' + str(numberTwo) + ' = ' + str(result)) 

conn, ender = s.accept()

print('Conectado em', ender)
while True:
    data = conn.recv(1024)
    if not data:
        print('Fechando a conexão')
        conn.close()
        break
    conn.sendall(data)

    # Não consegui executar com excelência a questão 1