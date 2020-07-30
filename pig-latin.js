export class translator {
  static translate(inp){
		return inp.split(" ").map(str => {
			var i = str.search(/a|e|i|o|(?<!q)u|xr|yt/);
			return str.slice(i) + str.slice(0, i) + "ay";
		}).join(" ");
	}
}
