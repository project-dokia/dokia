// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
//apiUrl: 'https://localhost:9443/dokia/api'

export const environment = {
  production: false,
  apiUrl: 'https://dokiaproject.mybluemix.net/api',
  apiUrlLogin: 'https://localhost:9443/dokia/'
};
