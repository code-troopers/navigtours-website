FROM node:5.11-onbuild
MAINTAINER Benjamin Cousin <b.cousin@code-troopers.com>

RUN npm install -g gulp bower

RUN bower install --allow-root

CMD ["gulp","serve"]

