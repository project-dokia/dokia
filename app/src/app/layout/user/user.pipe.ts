import { Pipe, PipeTransform } from '@angular/core';
@Pipe({ name: 'userSearch' })
export class UserPipe implements PipeTransform {
  transform(users: any, searchText: any): any {
    if(searchText == null) return users;

    return users.filter(function(userSearch){
      return userSearch.cn.toLowerCase().indexOf(searchText.toLowerCase()) > -1;
    })
  }
}