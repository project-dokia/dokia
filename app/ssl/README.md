

bash ./certgen.sh

preenchi br no country, o restante <enter>

openssl genrsa -out key.pem 1024
openssl req -newkey rsa:1024 -new -key key.pem -out csr.pem
openssl x509 -req -days 9999 -in csr.pem -signkey key.pem -out cert.pem
rm csr.pem

I see two ne files cert.pem and key.pem that look ok (I mean it content)

Then I run: ng serve --ssl 1 --ssl-key key.pem --ssl-cert cert.pem

ng serve --ssl 1 --ssl-key key.pem --ssl-cert cert.pem --open

