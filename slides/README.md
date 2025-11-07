# Create Slides

Using: https://docs.asciidoctor.org/reveal.js-converter/latest/

## With NodeJS
https://docs.asciidoctor.org/reveal.js-converter/latest/setup/node-js-setup/

### Install asciidoctor
```shell
npm init -y
``` 

```shell
npm i --save asciidoctor @asciidoctor/reveal.js
```

### Generate Slides
```shell
npx asciidoctor-revealjs presentation-jspecify.adoc
```