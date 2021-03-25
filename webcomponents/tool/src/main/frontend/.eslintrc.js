module.exports = {
  "env": { "browser": true, "es2021": true },
  "globals": {
    "$": "readonly",
    "portal": "readonly",
    "CKEDITOR": "readonly",
    "moment": "readonly",
  },
  "extends": "eslint:recommended",
  "parserOptions": { "ecmaVersion": 12, "sourceType": "module" },
  "rules": {
    "indent": ["warn", 2, { "SwitchCase": 1, "MemberExpression": "off", "ignoredNodes": ["TemplateLiteral > *"] }],
    "linebreak-style": ["warn","unix"],
    "semi": ["warn", "always"],
    "no-unused-vars": "warn",
    "no-undef": "warn",
    "no-useless-escape": "warn",
    "no-redeclare": "warn",
    "no-cond-assign": "warn",
    "no-empty": "warn",
    "no-var": "warn",
    "prefer-const": "warn",
    "no-param-reassign": "warn",
    "comma-spacing": "warn",
    "block-spacing": "warn",
    "no-duplicate-imports": "warn",
    "arrow-spacing": "warn",
    "no-multiple-empty-lines": "warn",
    "no-tabs": "warn",
  }
};