# JavaHtmlCompiler

A primitive Html "Compiler" in the style of Flask Jinja, or ASP.NET Razor, except not nearly as smart. For example, converts

```
<div>
  <h> Title: @model.Title </h>
</div>
<div>
  @model.MyStrings
</div>
```

to

```
<div>
  <h> Title: MyTitle </h>
</div>
<div>
  <a>Some string 1</a>
  <a>Some string 2</a>
  <a>Some other string 1</a>
</div>
```
