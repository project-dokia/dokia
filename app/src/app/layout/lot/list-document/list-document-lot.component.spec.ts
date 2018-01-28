import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListLotDocumentComponent } from './list-document-lot.component';

describe('ListLotDocumentComponent', () => {
  let component: ListLotDocumentComponent;
  let fixture: ComponentFixture<ListLotDocumentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListLotDocumentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListLotDocumentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
