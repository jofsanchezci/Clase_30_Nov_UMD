numero=int(input('Ingrese un numero: '))
if numero<0:
	print('ERROR')
else:
	acum=1
	for i in range(1,numero+1):
		acum*=i
		print(acum)

